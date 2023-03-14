import pandas as pd 

base = pd.read_json('dados.json')

print(base.head(30))

print(f'valor minimo: {min(base.valor)}')

print(f'valor maximo: {max(base.valor)}')

mean = base.valor.mean()

print(base.loc[base.valor > mean,'dia'])
